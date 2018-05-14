package dp.mediateur;

public class ConcreteTourMediateur implements TourMediateur {

	private ConcreteAvionA avionA;
	private ConcreteAvionB avionB;

	@Override
	public void setAvionA(ConcreteAvionA paramAvionA) {
		avionA = paramAvionA;

	}

	@Override
	public void setAvionB(ConcreteAvionB paramAvionB) {
		avionB = paramAvionB;

	}

	@Override
	public void transmettreMessageDeAvionA(String paramMessage) {
		avionB.recevoirMessage(paramMessage);

	}

	@Override
	public void transmettreMessageDeAvionB(String paramMessage) {
		avionA.recevoirMessage(paramMessage);
	}

}
