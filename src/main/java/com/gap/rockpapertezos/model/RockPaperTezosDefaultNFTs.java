package com.gap.rockpapertezos.model;


import java.util.List;
public class RockPaperTezosDefaultNFTs {
    private List<RockPaperTezosResponse> availableNFTS;

    public List<RockPaperTezosResponse> getAvailableNFTS() {
        return availableNFTS;
    }

    public void setAvailableNFTS(List<RockPaperTezosResponse> availableNFTS) {
        this.availableNFTS = availableNFTS;
    }
}
