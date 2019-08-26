package com.promesometro.promesometro;

import com.promesometro.entities.Promise;
import com.promesometro.repository.PromiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PromiseController {

    @Autowired
    private PromiseRepository promiseRepository;


    @RequestMapping(value = "/searchSimilar", method = RequestMethod.POST)
    public List<PromiseSimilarDTO> searchSimilarPromises( @RequestBody PromiseSim obj){
        Long idCandidate = obj.getIdCandidate();
        String promiseText = obj.getPromiseText();
        final List<PromiseSimilarDTO> similarPromises = new ArrayList<>();
        final List<Promise> promises = promiseRepository.findAllByCandidate(idCandidate);
        double threshold = 50d;

        if(promises.size()>0){
            for(Promise p: promises){
                final String existingPromiseText = p.getPromiseText();
                double score = determineSimilarity(existingPromiseText, promiseText);
                if(score>threshold && similarPromises.size()<=5){
                    PromiseSimilarDTO pr = new PromiseSimilarDTO();
                    pr.setIdCandidate(idCandidate);
                    pr.setPromiseText(p.getPromiseText());
                    pr.setIdPromise(p.getIdPromise());
                    pr.setSimilarity(score);

                    similarPromises.add(pr);
                }
                if(similarPromises.size()>5){
                    break;
                }
            }
        }

        return similarPromises;
    }

    private double determineSimilarity(String s1, String s2){
        String[] a1 = s1.toUpperCase().split(" ");
        String[] a2 = s2.toUpperCase().split(" ");
        double total = a1.length + a2.length;
        double match = 0;
        List<String>seen = new ArrayList<>();
        for(String t1: a1){
            for (String t2: a2){
                if(seen.contains(t1))
                    continue;
                if(t1.compareTo(t2)==0) {
                    seen.add(t2);
                    match += 2;
                }
            }
        }
        return (match/total)*100.0d;
    }





}

