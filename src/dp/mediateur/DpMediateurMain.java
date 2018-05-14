package dp.mediateur;

public class DpMediateurMain {

	public static void main(String[] args) {
		TourMediateur tMediateur = new ConcreteTourMediateur();

		ConcreteAvionA avionA = new ConcreteAvionA(tMediateur);
		ConcreteAvionB avionB = new ConcreteAvionB(tMediateur);

		avionA.envoyerMessageDeAvionA("Hello from Avion A");
		avionB.envoyerMessageDeAvionB("Hello from Avion B");
	}

}
