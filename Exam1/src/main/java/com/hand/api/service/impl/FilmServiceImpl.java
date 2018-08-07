package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.entity.FilmE;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveFilm(FilmE filmE) throws Exception{
        try {
            filmMapper.saveFilm(filmE);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error insert throws exception");
        }
        return filmMapper.saveFilm(filmE);
    }
}
