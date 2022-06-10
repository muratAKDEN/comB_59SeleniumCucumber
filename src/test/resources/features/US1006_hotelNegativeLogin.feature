Feature: TC1006 yanlis bilgilerle siteye giris yapilamaz
@qw
  Scenario: TC09 ya Given kullanici "HMCUrl" sayfasinda
    Given kullanici "HMCUrl" sayfasinda
    And Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir
@we
  Scenario: TC10 yanlis kullanici adi le giris yapilamaz
    Given kullanici "HMCUrl" sayfasinda
    And Log in yazisina tiklar
    And geceriz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC10 yanlis kullanici adi le giris yapilamaz
    Given kullanici "HMCUrl" sayfasinda
    And Log in yazisina tiklar
    And geceriz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir
