/// <reference types="cypress" />
 export class HomePage {
    getTitle(){
        return cy.title()
    }

    clickScrollbarsLink(){
        cy.get('#overview .container div.row:nth-child(3) .col-sm:nth-child(1) a').click()
    }
    
    clickClassAttributeLink(){
        cy.get('#overview div:nth-child(1) .row:nth-child(1) .col-sm:nth-child(2) h3 a').click()
    }
 }