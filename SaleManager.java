
public class SaleManager extends CampaignManager{
         @Override
         public void Sale(Game game) {
         	
         	
         	int sale2=game.gamePrice-((game.gamePrice)*game.discount/100);
         
         	System.out.println("pandemiye �zel %"+game.discount+ "indirim vard�r"+game.gamePrice+ " TL lik oyun al��veri�inizin indirimli fiyati: "+sale2);
         }
}
