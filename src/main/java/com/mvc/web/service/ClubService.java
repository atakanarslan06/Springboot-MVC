package com.mvc.web.service;

import com.mvc.web.dto.ClubDto;
import com.mvc.web.models.Club;


import java.util.List;

public interface ClubService {
    public List<ClubDto> getAllClubs();
    Club saveClub(Club club);
    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);
}
