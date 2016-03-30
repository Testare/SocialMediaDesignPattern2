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
public interface Classifier {
	/**
	 * Classifies an entry based on the training set
	 * 
	 * @param trainingSet
	 * @param testEntry
	 * @return 
	 */
	boolean classify(Set<SocialMediaEntry> trainingSet, SocialMediaEntry testEntry);
}
