package com.gap.rockpapertezos.service;

import com.gap.rockpapertezos.model.RockPaperTezosDefaultNFTs;
import com.gap.rockpapertezos.model.RockPaperTezosResponse;

public interface RockPaperTezosService {
    RockPaperTezosResponse getBoughtNft(int random, String buyer);
    RockPaperTezosDefaultNFTs getAllAvailableNfts();
}
