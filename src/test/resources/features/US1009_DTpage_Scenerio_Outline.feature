
 Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @asd
  Scenario Outline:TC14 5 farkli kayit yapabilmli
    Given kullanici amazon anasayfasinda
    Given kullanici "dataTablesUrl" sayfasinda
    Then new butonuna basar
    And firstname bolumune "<firstname>" girer
    And lastname bolumune "<lastname>" girer
    And position bolumune "<position>" girer
    And office bolumune "<office>" girer
    And extention bolumune "<extention>" girer
    And startDate bolumune "<startDate>" girer
    And salary bolumune "<salary>" girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
    And sayfayi kapatir

    Examples:
      |firstname |lastname |position |office |extention |startDate |salary |