Feature: US1004 kullanici parametre ile coniguration file i kullanabilmeli
  @pr2

  Scenario:TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "blueRentalUrl" sayfasinda
    Then kullanici 3 sn bekler
    And url in "blue" icerdigini test eder
    Then sayfayi kapatir
     #yorum satiri bu isaret ile