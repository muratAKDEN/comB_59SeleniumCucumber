# amazon agidipsirayla nutella , java, elma, armut aratalim
  #sonuclarin aradigimiz kelimeyi icerdigini test edelim


  Feature: US1007 kullanici amazonda istedigi elimeleri aratir

    Scenario Outline: TC12 amazon da listedeki elementleri aratma
      Given kullanici "amazonUrl" sayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelimeKontol>" icerdigini test eder
      And sayfayi kapatir



      Examples:
      |istenenKelime|istenenKelimeKontol|
      |nutella      |         nutella     |
      |java         |           java      |
      |elma         |          elma       |
      |armut        |           armut    |
