package model;

public class Level {

    /** The id. */
    private final int id;

    /** The name. */
    private String    name;

    /**
     * Instantiates a new level.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Level(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getId() + " : " + this.getName();
    }
}