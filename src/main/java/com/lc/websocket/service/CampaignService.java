package com.lc.websocket.service;


import com.lc.websocket.bean.CampaignDTO;
import com.lc.websocket.bean.GoogleCampaignDTO;

import java.util.List;

public interface CampaignService {

    Boolean insertCampaign(CampaignDTO campaignDTO);

    Boolean deleteCampaign(Long id);

    Boolean updateCampaign(CampaignDTO campaignDTO);

    List<CampaignDTO> getAllCampaign();

}
