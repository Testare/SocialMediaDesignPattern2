/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.Set;

/**
 *
 * @author Testare
 */
public class TrueClassifier implements Classifier{
	
	@Override
	public boolean classify(Set<SocialMediaEntry> trainingSet, SocialMediaEntry testEntry){
		return true;
	}
}
