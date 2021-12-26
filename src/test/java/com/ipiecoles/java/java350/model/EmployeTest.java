package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testNbAnneeAncienneteNow(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now());

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(0);
    }

    @Test
    public void testNbAnneeAncienneteNowMinus2(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().minusYears(2));

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(2);
    }

    @Test
    public void testNbAnneeAncienneteNowPlus3(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().plusYears(3));

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(0);
    }

    @Test
    public void testNbAnneeAncienneteNull(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(null);

        //When
        Integer nbAnnees = employe.getNombreAnneeAnciennete();

        //Then
        Assertions.assertThat(nbAnnees).isEqualTo(0);
    }

    @Test
    void augmentersalaire() {
        double salaire = 0;
        //Given
        Employe employe = new Employe("kenza", "alge", "T222", LocalDate.of(2019, Month.JANUARY, 10), 2000d, 1,1.4);
        employe.setSalaire(1200d);
        untaireٍsalaire = employe.getSalaire()  *  (persntageaugmentaion/10);

        //When
        double persntage = 2.0;
        employe.augmenterSalaire(2.0);
        //Then
        Assertions.assertThat(employe.getSalaire()).isEqualTo(salaire);


    }
    @Test
    void augmentersalaireNull(){
        //given
        Employe employe = new Employe("kenza", "alge", "T222", LocalDate.of(2019, Month.JANUARY, 10), 2000d, 1,1.4);
        //when
        employe.augmenterSalaire(0.2);
        //then
        Assertions.assertThat(employe.getSalaire()).isNull();
    }
}
