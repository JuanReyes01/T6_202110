package model.logic;

import java.util.Date;

public class Reproduccion implements Comparable<Reproduccion>{

	private double instrumentalness;
	private double liveness;
	private double speechiness;
	private double danceability;
	private double valence;
	private double loudness;
	private double tempo;
	private double acousticness;
	private double energy;
	private int mode;
	private int key;
	private String artist_id;
	private String tweet_lang;
	private String track_id;
	private Date created_at;
	private String lang;
	private String time_zone;
	private int user_id;
	private int id;
	
	public Reproduccion(double instrumentalness, double liveness, double speechiness,double danceability,double valence, double loudness,double tempo,
	double acousticness,double energy, int mode, int key, String artist_id, String tweet_lang,String track_id, Date created_at, String lang, String time_zone, int user_id, int id) {
	
		this.instrumentalness = instrumentalness;
		this.liveness = liveness;
		this.speechiness = speechiness;
		this.danceability = danceability;
		this.valence = valence;
		this.loudness = loudness;
		this.tempo = tempo;
		this.acousticness = acousticness;
		this.energy = energy;
		this.mode = mode;
		this.key = key;
		this.artist_id = artist_id;
		this.tweet_lang = tweet_lang;
		this.track_id = track_id;
		this.created_at = created_at;
		this.lang = lang;
		this.time_zone = time_zone;
		this.user_id = user_id;
		this.id = id;
	}

	/**
	 * @return the instrumentalness
	 */
	public double darInstrumentalness() {
		return instrumentalness;
	}

	/**
	 * @param instrumentalness the instrumentalness to asignar
	 */
	public void asignarInstrumentalness(double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}

	/**
	 * @return the liveness
	 */
	public double darLiveness() {
		return liveness;
	}

	/**
	 * @param liveness the liveness to asignar
	 */
	public void asignarLiveness(double liveness) {
		this.liveness = liveness;
	}

	/**
	 * @return the speechiness
	 */
	public double darSpeechiness() {
		return speechiness;
	}

	/**
	 * @param speechiness the speechiness to asignar
	 */
	public void asignarSpeechiness(double speechiness) {
		this.speechiness = speechiness;
	}

	/**
	 * @return the danceability
	 */
	public double darDanceability() {
		return danceability;
	}

	/**
	 * @param danceability the danceability to asignar
	 */
	public void asignarDanceability(double danceability) {
		this.danceability = danceability;
	}

	/**
	 * @return the valence
	 */
	public double darValence() {
		return valence;
	}

	/**
	 * @param valence the valence to asignar
	 */
	public void asignarValence(double valence) {
		this.valence = valence;
	}

	/**
	 * @return the loudness
	 */
	public double darLoudness() {
		return loudness;
	}

	/**
	 * @param loudness the loudness to asignar
	 */
	public void asignarLoudness(double loudness) {
		this.loudness = loudness;
	}

	/**
	 * @return the tempo
	 */
	public double darTempo() {
		return tempo;
	}

	/**
	 * @param tempo the tempo to asignar
	 */
	public void asignarTempo(double tempo) {
		this.tempo = tempo;
	}

	/**
	 * @return the acousticness
	 */
	public double darAcousticness() {
		return acousticness;
	}

	/**
	 * @param acousticness the acousticness to asignar
	 */
	public void asignarAcousticness(double acousticness) {
		this.acousticness = acousticness;
	}

	/**
	 * @return the energy
	 */
	public double darEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to asignar
	 */
	public void asignarEnergy(double energy) {
		this.energy = energy;
	}

	/**
	 * @return the mode
	 */
	public int darMode() {
		return mode;
	}

	/**
	 * @param mode the mode to asignar
	 */
	public void asignarMode(int mode) {
		this.mode = mode;
	}

	/**
	 * @return the key
	 */
	public int darKey() {
		return key;
	}

	/**
	 * @param key the key to asignar
	 */
	public void asignarKey(int key) {
		this.key = key;
	}

	/**
	 * @return the artist_id
	 */
	public String darArtist_id() {
		return artist_id;
	}

	/**
	 * @param artist_id the artist_id to asignar
	 */
	public void asignarArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}
	
	/**
	 * @return the tweet_lang
	 */
	public String darTweet_lang() {
		return tweet_lang;
	}

	/**
	 * @param tweet_lang the tweet_lang to asignar
	 */
	public void asignarTweet_lang(String tweet_lang) {
		this.tweet_lang = tweet_lang;
	}

	/**
	 * @return the track_id
	 */
	public String darTrack_id() {
		return track_id;
	}

	/**
	 * @param track_id the track_id to asignar
	 */
	public void asignarTrack_id(String track_id) {
		this.track_id = track_id;
	}

	/**
	 * @return the created_at
	 */
	public Date darCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to asignar
	 */
	public void asignarCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the lang
	 */
	public String darLang() {
		return lang;
	}

	/**
	 * @param lang the lang to asignar
	 */
	public void asignarLang(String lang) {
		this.lang = lang;
	}

	/**
	 * @return the time_zone
	 */
	public String darTime_zone() {
		return time_zone;
	}

	/**
	 * @param time_zone the time_zone to asignar
	 */
	public void asignarTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	/**
	 * @return the user_id
	 */
	public int darUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to asignar
	 */
	public void asignarUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the id
	 */
	public int darId() {
		return id;
	}

	/**
	 * @param id the id to asignar
	 */
	public void asignarId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Reproduccion o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
