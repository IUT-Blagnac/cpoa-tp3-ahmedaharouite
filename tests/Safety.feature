#Author: Ahmed
Feature: Safe Pizza

  En tant que gérant d une pizzeria classique, je veux garantir que chaque pizza commandée soit la bonne.

  Scenario: On essaye de commander 4 différentes Pizzas
  Given 1 Pizza P and 1 PizzaFromage PF and 1 PizzaGrecque PG and 1 PizzaPoivrons PP
  When  P, PF, PG et PP sont commandées
  Then  return 1 Pizza and 1 PizzaFromage and 1 PizzaGrecque and 1 PizzaPoivrons
  
  
  
