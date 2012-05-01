# Pratiquer DDD en un éclair

Dépôt GIT correspondant à mon tools in action donné à [Devoxx France 2012](http://www.devoxx.com/pages/viewpage.action?pageId=6128101 "Devoxx France 2012")

## Abstract :

Sensibiliser à la pratique de DDD au travers d'un outil simple et fédérateur, Sculptor.

## Présentation (10mn) :

Sculptor est un outil de génération d'application Java/JEE orientée DDD, qui se pilote au travers d'un DSL simple.

## Pratique (15mn) :

Le repository GIT contient des branches de features permettant de dérouler et décomposer la présentation en cinq parties. Dont les principes sont :

* `0_initial` :
    * cette branche présente le synopsis de l'application à coder en live et offre un squelette d'application vierge,
* `1_with_enum_and_basictype` :
    * cette branche contient les composants du domaine de base de l'application,
* `2_with_repository_and_service` :
    * cette branche contient le _Repository_ et _Service_ de l'entité _Présentation_,
* `3_with_generated_code_and_unit_tests` :
    * cette branche contient les tests de la couche _Service_ codés en _TDD_ dans la présentation,
* `4_with_rest_services_and_spring_support` :
    * cette branche contient la couche _REST_ de l'application. A ce stade l'application propose un _CRUD_ non habillé,
* `5_with_integration` :
    * cette branche contient la couche _REST_ avec une intégration basique, soit simplement un habillage _CSS_ des _JSP_ générées.

**Sur la branche `5_with_integration`, l'application se lance simplement par un 'mvn jetty:run' et est disponible à l'URL : `http://localhost:8888/rest/presentation`**

