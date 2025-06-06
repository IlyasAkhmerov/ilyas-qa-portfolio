 /// <reference types="cypress" />
import {ClassAttributePage} from '../page-objects/class-attribute-page'
import {HomePage} from '../page-objects/home-page'

describe('Class Attribute page tests', () => {
    const classAttributePage = new ClassAttributePage()
    const homePage = new HomePage()
    beforeEach(() => {
      cy.visit('http://uitestingplayground.com/')
    })

    it('Open home page, go to "Class Attribute", click button, close Alert', () => {
      homePage.clickClassAttributeLink()
      classAttributePage.clickButton()
      classAttributePage.verifyAlertText('Primary button pressed');
    })
 })