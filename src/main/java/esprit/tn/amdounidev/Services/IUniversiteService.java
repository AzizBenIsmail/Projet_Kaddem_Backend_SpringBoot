package esprit.tn.amdounidev.Services;

import esprit.tn.amdounidev.entities.Universite;

import java.util.List;


public interface IUniversiteService {

    Universite addUniversite(Universite d);

    List<Universite> addUniversite(List<Universite> listUniversite);

    Universite updateUniversite(Universite d,long id);

    List<Universite> updateUniversite(List<Universite> listUniversite);

    void deleteUniversite(Long id);

    void deleteUniversite(Universite d);

    List<Universite> findAllUniversite();

    Universite findUniversiteById(Long id);

    Universite findBynomUniversite(String Nom);

    }
