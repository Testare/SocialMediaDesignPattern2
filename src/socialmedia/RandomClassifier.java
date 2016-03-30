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
public class RandomClassifier implements Classifier{
	
	@Override
	public boolean classify(Set<SocialMediaEntry> trainingSet, SocialMediaEntry testEntry) {
		return (Math.floor(Math.random() * 2) == 0.0d);
	}
}
