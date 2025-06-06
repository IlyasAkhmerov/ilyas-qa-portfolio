 /// <reference types="cypress" />
 export class ScrollbarsPage {
    
    getTitle(){
        return cy.title('section .container h3');
    }
    
    clickHiddenButton(){
        cy.get('#hidingButton')
        .scrollIntoView()   // Лучше подходит для "спрятанных" элементов
        .should('be.visible')  // Убедиться, что элемент видим
        .click();
        
    }
 }