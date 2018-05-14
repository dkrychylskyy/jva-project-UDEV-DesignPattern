package dp.mediateur;

public class ConcreteAvionA extends Avion {

	public ConcreteAvionA(TourMediateur paramTourMediateur) {
		super(paramTourMediateur);
		tourMediateur.setAvionA(this);
	}

	@Override
	public void recevoirMessage(String paramMessage) {
		System.out.println("Avion A a reçu un message : " + paramMessage);

	}

	public void envoyerMessageDeAvionA(String paramMessage) {
		tourMediateur.transmettreMessageDeAvionA(paramMessage);
	}

}
