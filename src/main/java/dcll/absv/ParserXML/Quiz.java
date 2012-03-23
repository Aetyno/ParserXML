package dcll.absv.ParserXML;

import java.util.ArrayList;
import java.io.File;

import javax.swing.text.html.parser.Element;

public class Quiz {
	
	File fichierXML;
	ArrayList<Question> questions;		// la liste des questions
	
	ArrayList<IQuestion> questions1;
	
	public Quiz(ArrayList<Question> questions) {
		super();
		this.questions = questions;
	}
	
	public void toXML(){
		
	}
	
	public void openFile(String _file){
		
		Element parent = new Element("parent", 1);
		   Element child = new Element("child", 0);
		   parent.appendChild(child);
		   Nodes results = child.query("/*");
		   Node result = result.get(0);
	}
	
	public IQuestion getQuestion(int _n){
		if(_n<questions1.size()){
			return questions1.get(_n);
		}
		else{
			return null;
		}
	}
	
	public void deleteQuestion(int _n){
		if(_n<questions1.size()){
			questions1.remove(_n);
		}
	}
	
	public void deleteQuestion(IQuestion _question){
		questions1.remove(_question);
	}
	
	public void addQuestionCategory(){
		questions1.add(new QuestionCategory());		
	}
	
	public void addQuestionCalculated(){
		questions1.add(new QuestionCalculated());		
	}
	
	public void addQuestionDescription(){
		questions1.add(new QuestionDescription());		
	}
	
	public void addQuestionEssay(){
		questions1.add(new QuestionEssay());		
	}
	
	public void addQuestionMatching(){
		questions1.add(new QuestionMatching());		
	}
	
	public void addQuestionCloze(){
		questions1.add(new QuestionCloze());		
	}
	
	public void addQuestionMultiChoice(){
		questions1.add(new QuestionMultiChoice());		
	}
	
	public void addQuestionNumerical(){
		questions1.add(new QuestionNumerical());		
	}
	
	public void addQuestionShortAnswer(){
		questions1.add(new QuestionShortAnswer());		
	}
	
	public void addQuestionTrueFalse(){
		questions1.add(new QuestionTrueFalse());		
	}
}
