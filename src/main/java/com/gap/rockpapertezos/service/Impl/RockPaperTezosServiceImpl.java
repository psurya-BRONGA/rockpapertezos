package com.gap.rockpapertezos.service.Impl;

import com.gap.rockpapertezos.model.RockPaperTezosDefaultNFTs;
import com.gap.rockpapertezos.model.RockPaperTezosResponse;
import com.gap.rockpapertezos.service.RockPaperTezosService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
@Log4j2
public class RockPaperTezosServiceImpl implements RockPaperTezosService {

    private static Map<Integer,RockPaperTezosResponse> allHoodies = hoodieList();
    private static RockPaperTezosResponse randomHoodie;
    private static RockPaperTezosDefaultNFTs defaultNFTs;

    @Override
    public RockPaperTezosResponse getBoughtNft(int random,String buyer) {
        randomHoodie = allHoodies.get(random);
        randomHoodie.setHoodieOwner(buyer);
        return randomHoodie;
    }

    @Override
    public RockPaperTezosDefaultNFTs getAllAvailableNfts() {
        if(null != defaultNFTs)
            return defaultNFTs;
        defaultNFTs = new RockPaperTezosDefaultNFTs();
        defaultNFTs.setAvailableNFTS(allHoodies.values().stream().collect(Collectors.toList()));
        return defaultNFTs;
    }

    static Map<Integer,RockPaperTezosResponse> hoodieList(){
        if ( allHoodies == null )
        allHoodies = new HashMap<>();
        allHoodies.put(5,new RockPaperTezosResponse(1,"Brown",20.0,"QmbMYuPvfV95fy131XeVSEnhAEM4jaAnouQd2gD2dgorN6","","2109_GAP_CROAKIES_v128_Generative11.png"));
        allHoodies.put(1,new RockPaperTezosResponse(2,"Grey",20.0,"QmUfBBLqivjBy1aUTowQkSsacXc5CFG53DbRhVGvBp4PLn","","2109_GAP_CROAKIES_v128_Generative12.png"));
        allHoodies.put(4,new RockPaperTezosResponse(3,"Navy Blue",20.0,"QmNY1hCynw51NSdfvdGJNe9WJ72q3Zieu6C4iKDfAGCBNG","","2109_GAP_CROAKIES_v128_Generative13.png"));
        allHoodies.put(2,new RockPaperTezosResponse(4,"Ocean Blue",20.0,"QmY8CfghfTKDpRiT6ccKwwsiuYhphM6AXPZExNrFtzw9Vy","","2109_GAP_CROAKIES_v128_Generative14.png"));
        allHoodies.put(3,new RockPaperTezosResponse(5,"Purple",20.0,"QmSTifWSh4KFZuhctPLgoFD1TponZYjynqDz3q7JZtDxNf","","2109_GAP_CROAKIES_v128_Generative15.png"));
        allHoodies.put(10,new RockPaperTezosResponse(6,"Black",20.0,"Qme1ANFe2KxUafRMtJyi9fXvrJZMYVzBX9A6bcmHrPiaUp","","2109_GAP_CROAKIES_v128_Generative16.png"));
        allHoodies.put(9,new RockPaperTezosResponse(7,"Pink",20.0,"QmcAG15b5Xfcz9y9hG2YZGg4Qt1pfY7ZdBsqz6sJzGxsUJ","","2109_GAP_CROAKIES_v128_Generative17.png"));
        allHoodies.put(7,new RockPaperTezosResponse(8,"Green",20.0,"QmVZUuwT7JfHzKBuzY5suHeysYBuU54ZWPcVgAsqGwLEKH","","2109_GAP_CROAKIES_v128_Generative18.png"));
        allHoodies.put(6,new RockPaperTezosResponse(9,"Blue",20.0,"QmX7Jo6tbWftjkJNQPZjvS44Ye1xxQSjxnkSbdxmuLqXxA","","2109_GAP_CROAKIES_v128_Generative19.png"));
        allHoodies.put(8,new RockPaperTezosResponse(10,"Lemon Yellow",20.0,"Qmf6VLjEWirqZqkygVxK22oxCCQP29NbY8BWEspFQXVhA5","","2109_GAP_CROAKIES_v128_Generative20.png"));
        return allHoodies;
    }

}
