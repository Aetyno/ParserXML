/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dcll.absv.ParserXML;

import nu.xom.*;

/**
 *
 * @author Nicolas
 */
public class QuestionTrueFalse extends QuestionClasseIntermediaire{
    private String answerTrue; 
    private String answerFalse;
    
    public QuestionTrueFalse(){
        super();
        answerTrue="";
        answerFalse="";
    }
    
    @Override
    public Element toXML() {
        Element eQuestion = new Element("question");
        Attribute aTypeQuestion = new Attribute("type","truefalse");
        eQuestion.addAttribute(aTypeQuestion);
        
        Element eFeedbackCorrect = new Element("feedback");
        eFeedbackCorrect.appendChild(QuestionCloze.getElementText("Correct !"));
        
        Element eFeedbackWrong = new Element("feedback");
        eFeedbackWrong.appendChild(QuestionCloze.getElementText("Oops !"));
        
        Element eTrue = new Element("true");
        eTrue.appendChild(QuestionCloze.getElementText("true"));
       
        Element eFalse = new Element("false");
        eFalse.appendChild(QuestionCloze.getElementText("false"));

        
        if (this.answerTrue=="true") {
       	 Attribute aTrueFraction = new Attribute("fraction","100");
            Attribute aFalseFraction = new Attribute("fraction","0");
			eTrue.appendChild(eFeedbackCorrect);
			eFalse.appendChild(eFeedbackWrong);
	        eTrue.addAttribute(aTrueFraction);
	        eFalse.addAttribute(aFalseFraction);
		} else {
			Attribute aTrueFraction = new Attribute("fraction","0");
            Attribute aFalseFraction = new Attribute("fraction","100");
			eTrue.appendChild(eFeedbackWrong);
			eFalse.appendChild(eFeedbackCorrect);
	        eTrue.addAttribute(aTrueFraction);
	        eFalse.addAttribute(aFalseFraction);
		}
        
        eQuestion.appendChild(eFalse);
		eQuestion.appendChild(eTrue);

        return eQuestion;
    }
    
    public void importXML(String _xml) {
		// TODO Auto-generated method stub
		
	}
    
    public String getAnswerTrueFeedBack(){
        return answerTrue;
    }
    
    public String getAnswerFalseFeedBack(){
    	return answerFalse;
    }
    
    public void setAnswerTrueFeedBack(String _answer){
        answerTrue =_answer;
    }
    
    public void setAnswerFalseFeedBack(String _answer){
        answerTrue =_answer;
    }
}
