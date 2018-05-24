package extra;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null,"What is yout star sign?");
	if(answer.equals("Aries")) {
	JOptionPane.showMessageDialog(null,"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	}
	if(answer.equals("Taurus")) {
		JOptionPane.showMessageDialog(null,"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	}
	if(answer.equals("Gemini")) {
		JOptionPane.showMessageDialog(null,"Cerebral, chatty, loves learning and education, charming, and adventurous.");
		if(answer.equals("cancer")) {
			JOptionPane.showMessageDialog(null,"Emotional, group oriented, seeks security, family.");
		}
		if(answer.equals("Leo")) {
			JOptionPane.showMessageDialog(null,"Generous, organized, protective, beautiful.");
		}
		
		if(answer.equals("Virgo")) {
			JOptionPane.showMessageDialog(null,"Particular, logical, practical, sense of duty, critical.");
		}
			if(answer.equals("Libra")) {
				JOptionPane.showMessageDialog(null,"Balanced, seeks beauty, sense of justice.");
			}
				if(answer.equals("scorpio")) {
					JOptionPane.showMessageDialog(null,"Passionate, exacting, loves extremes, combative, reflective.");
				}
					if(answer.equals("sagittarius")) {
						JOptionPane.showMessageDialog(null,"Happy, absent minded, creative, adventurous.");
					}
						if(answer.equals("Capricorn")) {
							JOptionPane.showMessageDialog(null,"Timeless, driven, calculating, ambitious.");
						}
							if(answer.equals("Aquarius")) {
								JOptionPane.showMessageDialog(null,"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.");
							}
							if(answer.equals("Pisces")) {
								JOptionPane.showMessageDialog(null,"Likeable, energetic, passionate, sensitive");
							}
						
								
		
		
	}
}
}
