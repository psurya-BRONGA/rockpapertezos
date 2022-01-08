package com.gap.rockpapertezos.controller;



import com.gap.rockpapertezos.model.RockPaperTezosDefaultNFTs;
import com.gap.rockpapertezos.model.RockPaperTezosErrorResponse;
import com.gap.rockpapertezos.model.RockPaperTezosResponse;

import com.gap.rockpapertezos.service.RockPaperTezosService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class RockPaperTezosController {

    @Autowired
    private RockPaperTezosService rockPaperTezosService;


    static int noOfRequests = 0;

    @GetMapping(value = "/buyNFT/{buyer}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity buyNFT(@PathVariable("buyer") String buyer) {
        noOfRequests+=1;
        if(noOfRequests > 10)
            return ResponseEntity.internalServerError().body(new RockPaperTezosErrorResponse());
        return ResponseEntity.ok().body(rockPaperTezosService.getBoughtNft(noOfRequests,buyer));
    }
    @GetMapping(value = "/loadAllNfts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RockPaperTezosDefaultNFTs> loadAllNfts() {
        return ResponseEntity.ok().body(rockPaperTezosService.getAllAvailableNfts());
    }

}
