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
public class QuestionCategory implements IQuestion{
    private String category;
    
    public QuestionCategory(){
        category="";
    }
    
    public QuestionCategory(String xml){
        
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String _category){
        category=_category;
    }

    public Element toXML() {
    	Element eQuestion = new Element("question");
    	eQuestion.addAttribute(new Attribute("type","category"));
    	
    	Element eCategory = new Element("category");
    	eCategory.appendChild(Quiz.getElementText(this.category));
    	
    	eQuestion.appendChild(eCategory);
    	
    	return eQuestion;
    }

	public void importXML(Element _xml) {
		// TODO Auto-generated method stub
		if (_xml.getFirstChildElement("category")!=null) {
			this.setCategory(_xml.getFirstChildElement("category").getFirstChildElement("text").getValue());
		}
	}
    
}
