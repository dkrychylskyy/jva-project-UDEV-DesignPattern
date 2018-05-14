package dp.mediateur;

public abstract class Avion {
	protected TourMediateur tourMediateur;

	public Avion(TourMediateur paramTourMediateur) {
		tourMediateur = paramTourMediateur;
	}

	public abstract void recevoirMessage(String paramMessage);
}
