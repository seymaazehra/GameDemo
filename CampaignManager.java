
public class CampaignManager {
	
    public void Sale(Game game) {
    	
    	int sale=(game.gamePrice)*game.discount/100;
    	int sale2=game.gamePrice-((game.gamePrice)*game.discount/100);
    	String sale3="500tl �zeri oyun al��veri�inde %20 oran�nda indirim uygulan�r.";
    	System.out.println("sadece size �zel"+ game.gamePrice+" TL fiyatl� �r�n�n indirim oran�: % "+game.discount+ " indirim tutar� :"+sale+
    			     " indirimli oyun fiyati "+sale2 +"\n"+sale3);
    }
}
