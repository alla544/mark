
Feature: Title of your feature
  I want to use this template for my feature file

  

  
  Scenario Outline: assert done
  Given home page
  When user enters product name "<product>"
  And user clicks find element
  Then user clicks add to cart

    Examples: 
      | product   |
      | headphone |
       
