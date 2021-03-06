/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/visualization_msgs/msg/InteractiveMarkerControl.msg */

package ros.pkg.visualization_msgs.msg;

import java.nio.ByteBuffer;

public class InteractiveMarkerControl extends ros.communication.Message {
  static public final short INHERIT = 0;
  static public final short FIXED = 1;
  static public final short VIEW_FACING = 2;
  static public final short NONE = 0;
  static public final short MENU = 1;
  static public final short BUTTON = 2;
  static public final short MOVE_AXIS = 3;
  static public final short MOVE_PLANE = 4;
  static public final short ROTATE_AXIS = 5;
  static public final short MOVE_ROTATE = 6;

  public java.lang.String name = new java.lang.String();
  public ros.pkg.geometry_msgs.msg.Quaternion orientation = new ros.pkg.geometry_msgs.msg.Quaternion();
  public short orientation_mode;
  public short interaction_mode;
  public boolean always_visible;
  public java.util.ArrayList<ros.pkg.visualization_msgs.msg.Marker> markers = new java.util.ArrayList<ros.pkg.visualization_msgs.msg.Marker>();
  public boolean independent_marker_orientation;
  public java.lang.String description = new java.lang.String();

  public InteractiveMarkerControl() {
  }

  public static java.lang.String __s_getDataType() { return "visualization_msgs/InteractiveMarkerControl"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "f69c49e4eb251b5b0a89651eebf5a277"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Represents a control that is to be displayed together with an interactive marker\n" +
"\n" +
"# Identifying string for this control.\n" +
"# You need to assign a unique value to this to receive feedback from the GUI\n" +
"# on what actions the user performs on this control (e.g. a button click).\n" +
"string name\n" +
"\n" +
"\n" +
"# Defines the local coordinate frame (relative to the pose of the parent\n" +
"# interactive marker) in which is being rotated and translated.\n" +
"# Default: Identity\n" +
"geometry_msgs/Quaternion orientation\n" +
"\n" +
"\n" +
"# Orientation mode: controls how orientation changes.\n" +
"# INHERIT: Follow orientation of interactive marker\n" +
"# FIXED: Keep orientation fixed at initial state\n" +
"# VIEW_FACING: Align y-z plane with screen (x: forward, y:left, z:up).\n" +
"uint8 INHERIT = 0 \n" +
"uint8 FIXED = 1\n" +
"uint8 VIEW_FACING = 2\n" +
"\n" +
"uint8 orientation_mode\n" +
"\n" +
"# Interaction mode for this control\n" +
"# \n" +
"# NONE: This control is only meant for visualization; no context menu.\n" +
"# MENU: Like NONE, but right-click menu is active.\n" +
"# BUTTON: Element can be left-clicked.\n" +
"# MOVE_AXIS: Translate along local x-axis.\n" +
"# MOVE_PLANE: Translate in local y-z plane.\n" +
"# ROTATE_AXIS: Rotate around local x-axis.\n" +
"# MOVE_ROTATE: Combines MOVE_PLANE and ROTATE_AXIS.\n" +
"uint8 NONE = 0 \n" +
"uint8 MENU = 1\n" +
"uint8 BUTTON = 2\n" +
"uint8 MOVE_AXIS = 3 \n" +
"uint8 MOVE_PLANE = 4\n" +
"uint8 ROTATE_AXIS = 5\n" +
"uint8 MOVE_ROTATE = 6\n" +
"\n" +
"uint8 interaction_mode\n" +
"\n" +
"\n" +
"# If true, the contained markers will also be visible\n" +
"# when the gui is not in interactive mode.\n" +
"bool always_visible\n" +
"\n" +
"\n" +
"# Markers to be displayed as custom visual representation.\n" +
"# Leave this empty to use the default control handles.\n" +
"#\n" +
"# Note: \n" +
"# - The markers can be defined in an arbitrary coordinate frame,\n" +
"#   but will be transformed into the local frame of the interactive marker.\n" +
"# - If the header of a marker is empty, its pose will be interpreted as \n" +
"#   relative to the pose of the parent interactive marker.\n" +
"Marker[] markers\n" +
"\n" +
"\n" +
"# In VIEW_FACING mode, set this to true if you don't want the markers\n" +
"# to be aligned with the camera view point. The markers will show up\n" +
"# as in INHERIT mode.\n" +
"bool independent_marker_orientation\n" +
"\n" +
"\n" +
"# Short description (< 40 characters) of what this control does,\n" +
"# e.g. \"Move the robot\". \n" +
"# Default: A generic description based on the interaction mode\n" +
"string description\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
"================================================================================\n" +
"MSG: visualization_msgs/Marker\n" +
"# See http://www.ros.org/wiki/rviz/DisplayTypes/Marker and http://www.ros.org/wiki/rviz/Tutorials/Markers%3A%20Basic%20Shapes for more information on using this message with rviz\n" +
"\n" +
"uint8 ARROW=0\n" +
"uint8 CUBE=1\n" +
"uint8 SPHERE=2\n" +
"uint8 CYLINDER=3\n" +
"uint8 LINE_STRIP=4\n" +
"uint8 LINE_LIST=5\n" +
"uint8 CUBE_LIST=6\n" +
"uint8 SPHERE_LIST=7\n" +
"uint8 POINTS=8\n" +
"uint8 TEXT_VIEW_FACING=9\n" +
"uint8 MESH_RESOURCE=10\n" +
"uint8 TRIANGLE_LIST=11\n" +
"\n" +
"uint8 ADD=0\n" +
"uint8 MODIFY=0\n" +
"uint8 DELETE=2\n" +
"\n" +
"Header header                        # header for time/frame information\n" +
"string ns                            # Namespace to place this object in... used in conjunction with id to create a unique name for the object\n" +
"int32 id 		                         # object ID useful in conjunction with the namespace for manipulating and deleting the object later\n" +
"int32 type 		                       # Type of object\n" +
"int32 action 	                       # 0 add/modify an object, 1 (deprecated), 2 deletes an object\n" +
"geometry_msgs/Pose pose                 # Pose of the object\n" +
"geometry_msgs/Vector3 scale             # Scale of the object 1,1,1 means default (usually 1 meter square)\n" +
"std_msgs/ColorRGBA color             # Color [0.0-1.0]\n" +
"duration lifetime                    # How long the object should last before being automatically deleted.  0 means forever\n" +
"bool frame_locked                    # If this marker should be frame-locked, i.e. retransformed into its frame every timestep\n" +
"\n" +
"#Only used if the type specified has some use for them (eg. POINTS, LINE_STRIP, ...)\n" +
"geometry_msgs/Point[] points\n" +
"#Only used if the type specified has some use for them (eg. POINTS, LINE_STRIP, ...)\n" +
"#number of colors must either be 0 or equal to the number of points\n" +
"#NOTE: alpha is not yet used\n" +
"std_msgs/ColorRGBA[] colors\n" +
"\n" +
"# NOTE: only used for text markers\n" +
"string text\n" +
"\n" +
"# NOTE: only used for MESH_RESOURCE markers\n" +
"string mesh_resource\n" +
"bool mesh_use_embedded_materials\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"================================================================================\n" +
"MSG: std_msgs/ColorRGBA\n" +
"float32 r\n" +
"float32 g\n" +
"float32 b\n" +
"float32 a\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public InteractiveMarkerControl clone() {
    InteractiveMarkerControl c = new InteractiveMarkerControl();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + name.length();
    __l += orientation.serializationLength();
    __l += 1; // orientation_mode
    __l += 1; // interaction_mode
    __l += 1; // always_visible
    __l += 4;
    for(ros.pkg.visualization_msgs.msg.Marker val : markers) {
      __l += val.serializationLength();
    }
    __l += 1; // independent_marker_orientation
    __l += 4 + description.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, name);
    orientation.serialize(bb, seq);
    bb.put((byte)orientation_mode);
    bb.put((byte)interaction_mode);
    bb.put((byte)(always_visible ? 1 : 0));
    bb.putInt(markers.size());
    for(ros.pkg.visualization_msgs.msg.Marker val : markers) {
      val.serialize(bb, seq);
    }
    bb.put((byte)(independent_marker_orientation ? 1 : 0));
    Serialization.writeString(bb, description);
  }

  public void deserialize(ByteBuffer bb) {
    name = Serialization.readString(bb);
    orientation.deserialize(bb);
    orientation_mode = (short)(bb.get() & 0xff);
    interaction_mode = (short)(bb.get() & 0xff);
    always_visible = bb.get() != 0 ? true : false;

    int __markers_len = bb.getInt();
    markers = new java.util.ArrayList<ros.pkg.visualization_msgs.msg.Marker>(__markers_len);
    for(int __i=0; __i<__markers_len; __i++) {
      ros.pkg.visualization_msgs.msg.Marker __tmp = new ros.pkg.visualization_msgs.msg.Marker();
      __tmp.deserialize(bb);
      markers.add(__tmp);;
    }
    independent_marker_orientation = bb.get() != 0 ? true : false;
    description = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof InteractiveMarkerControl))
      return false;
    InteractiveMarkerControl other = (InteractiveMarkerControl) o;
    return
      name.equals(other.name) &&
      orientation.equals(other.orientation) &&
      orientation_mode == other.orientation_mode &&
      interaction_mode == other.interaction_mode &&
      always_visible == other.always_visible &&
      markers.equals(other.markers) &&
      independent_marker_orientation == other.independent_marker_orientation &&
      description.equals(other.description) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.name == null ? 0 : this.name.hashCode());
    result = prime * result + (this.orientation == null ? 0 : this.orientation.hashCode());
    result = prime * result + this.orientation_mode;
    result = prime * result + this.interaction_mode;
    result = prime * result + (this.always_visible ? 1231 : 1237);
    result = prime * result + (this.markers == null ? 0 : this.markers.hashCode());
    result = prime * result + (this.independent_marker_orientation ? 1231 : 1237);
    result = prime * result + (this.description == null ? 0 : this.description.hashCode());
    return result;
  }
} // class InteractiveMarkerControl

