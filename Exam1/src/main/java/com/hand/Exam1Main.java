package com.hand;

import com.hand.api.service.FilmService;
import com.hand.api.service.impl.FilmServiceImpl;
import com.hand.entity.FilmE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam1Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        FilmService filmService = (FilmService) ac.getBean(FilmServiceImpl.class);
//        String title = "ANIMAL WORLD";
//        String description = "Many Kinds of Animals";
//        Long languageId = 1L;
        String title = System.getenv("TITLE");
        String description = System.getenv("DESCRIPTION");
        Long languageId = Long.parseLong(System.getenv("LANGUAGEID"));

        try {
            FilmE filmE = new FilmE();
            filmE.setDescription(description);
            filmE.setLanguageId(languageId);
            filmE.setTitle(title);
            System.out.println("Film Title:");
            System.out.println(title);
            System.out.println("Film Description:");
            System.out.println(description);
            System.out.println("Film LanguageId:");
            System.out.println(languageId);

            filmService.saveFilm(filmE);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
