package dp.mediateur;

public interface TourMediateur {
	public void setAvionA(ConcreteAvionA paramAvionA);
	public void setAvionB(ConcreteAvionB paramAvionB);

	public void transmettreMessageDeAvionA(String paramMessage);
	public void transmettreMessageDeAvionB(String paramMessage);
}
