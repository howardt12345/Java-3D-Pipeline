import java.util.*;
import java.io.*;
@SuppressWarnings({ "unused", "serial" })
public class Transform implements Serializable {
	/** The position of the Transform stored as a Point.
	 * @param position the location of the Transform.
	 */
	private Coordinate position = Coordinate.center;
	/** The rotation of the Transform stored as a Rotation.
	 * @param rotation the Rotation of the Transform.
	 */
	private Rotation rotation = Rotation.zero;
	/** The scale of the Transform stored as a Scale.
	 * @param scale the Scale of the Transform.
	 */
	private Scale scale = new Scale (1);
	/** Creates a Transform from a Point, a Rotation, and a Scale.
	 * @param transform the location of the Transform.
	 * @param rot the rotation of the Transform.
	 * @param scale the Scale of the Transform.
	 */
	public Transform (Coordinate loc, Rotation rot, Scale sc) {
		position = loc;
		rotation = rot;
		scale = sc;
	}
	/** Creates a Transform off of a Point and a Rotation, with the Scale defaulting at 1.
	 * @param location the location of the Transform.
	 * @param rot the rotation of the Transform.
	 */
	public Transform (Coordinate location, Rotation rot) {
		position = location;
		rotation = rot;
		scale = new Scale (1);
	}
	/** Creates a new Transform.*/
	public Transform () {}
	public Transform(double posX, double posY, double posZ) {
		position = new Coordinate (posX, posY, posZ);
	}
	public Transform (Coordinate pos) {
		position = pos;
	}
	public void print() {
		position.print();
		rotation.print();
		scale.print();
	}
	public boolean equals (Transform t) {
		return position.equals(t.position) && rotation.equals(t.rotation) && scale.equals(t.scale);
	}
	/** Gets the position of the Transform as a Point.*/
	public Coordinate getPosition() {
		return position;
	}
	/** Gets the rotation of the Transform as a Rotation.*/
	public Rotation getRotation() {
		return rotation;
	}
	/** Gets the scale of the Transform as a Scale.*/
	public Scale getScale () {
		return scale;
	}
	/** Gets the Position X value.*/
	public double getPosX () {
		return position.getX();
	}
	/** Gets the Position Y value.*/
	public double getPosY () {
		return position.getY();
	}
	/** Gets the Position Z value.*/
	public double getPosZ () {
		return position.getZ();
	}
	/** Gets the Rotation X value.*/
	public double getRotX () {
		return rotation.getX();
	}
	/** Gets the Rotation Y value.*/
	public double getRotY () {
		return rotation.getY();
	}
	/** Gets the Rotation Z value.*/
	public double getRotZ () {
		return rotation.getZ();
	}
	/** Gets the scale X value.*/
	public double getScaleX () {
		return scale.getX();
	}
	/** Gets the scale Y value.*/
	public double getScaleY () {
		return scale.getY();
	}
	/** Gets the scale Z value.*/
	public double getScaleZ () {
		return scale.getZ();
	}
	/** Sets position, rotation, and scale of an existing Transform.
	 * @param new_pos new position
	 * @param new_rot new rotation
	 * @param new_scale new scale
	 */
	public void Set (Coordinate new_pos, Rotation new_rot, Scale new_scale) {
		position = new_pos;
		rotation = new_rot;
		scale = new_scale;
	}
	/** Sets a new position for the Transform.
	 * @param new_pos new position
	 */
	public void setPosition (Coordinate new_pos) {
		position = new_pos;
	}
	/** Sets the X value of the position.
	 * @param new_X the new X value.*/
	public void setPosX (double new_X) {
		position.setX(new_X);
	}
	/** Sets the Y value of the position.
	 * @param new_Y the new Y value.*/
	public void setPosY(double new_Y) {
		position.setY(new_Y);
	}
	/** Sets the Z value of the position.
	 * @param new_Z the new Z value.*/
	public void setPosZ(double new_Z) {
		position.setZ(new_Z);
	}
	/** Sets a new Rotation for the Transform.
	 * @param new_rot new rotation
	 */
	public void setRotation (Rotation new_rot) {
		rotation = new_rot;
	}
	/** Sets the X value of the Rotation.
	 * @param new_X the new X value.*/
	public void setRotX (double new_X) {
		rotation.setX(new_X);
	}
	/** Sets the Y value of the Rotation.
	 * @param new_Y the new Y value.*/
	public void setRotY(double new_Y) {
		rotation.setY(new_Y);
	}
	/** Sets the Z value of the Rotation.
	 * @param new_Z the new Z value.*/
	public void setRotZ(double new_Z) {
		rotation.setZ(new_Z);
	}
	/** Sets a new scale for the Transform.
	 * @param new_scale new scale
	 */
	public void setScale (Scale new_scale) {
		scale = new_scale;
	}
	/** Sets the X value of the scale.
	 * @param new_X the new X value.*/
	public void setScaleX (double new_X) {
		scale.setX(new_X);
	}
	/** Sets the Y value of the scale.
	 * @param new_Y the new Y value.*/
	public void setScaleY(double new_Y) {
		scale.setY(new_Y);
	}
	/** Sets the Z value of the scale.
	 * @param new_Z the new Z value.*/
	public void setScaleZ(double new_Z) {
		scale.setZ(new_Z);
	}
}
