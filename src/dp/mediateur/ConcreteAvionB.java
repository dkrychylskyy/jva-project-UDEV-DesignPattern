package dp.mediateur;

public class ConcreteAvionB extends Avion {

	public ConcreteAvionB(TourMediateur paramTourMediateur) {
		super(paramTourMediateur);
		tourMediateur.setAvionB(this);
	}

	@Override
	public void recevoirMessage(String paramMessage) {
		System.out.println("Avion B a reçu un message : " + paramMessage);
	}

	public void envoyerMessageDeAvionB(String paramMessage) {
		tourMediateur.transmettreMessageDeAvionB(paramMessage);
	}

}
