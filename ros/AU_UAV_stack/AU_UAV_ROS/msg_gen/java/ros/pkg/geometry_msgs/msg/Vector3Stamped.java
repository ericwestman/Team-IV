/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/common_msgs/geometry_msgs/msg/Vector3Stamped.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class Vector3Stamped extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.geometry_msgs.msg.Vector3 vector = new ros.pkg.geometry_msgs.msg.Vector3();

  public Vector3Stamped() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/Vector3Stamped"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "7b324c7325e683bf02a9b14b01090ec7"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This represents a Vector3 with reference coordinate frame and timestamp\n" +
"Header header\n" +
"Vector3 vector\n" +
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
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Vector3Stamped clone() {
    Vector3Stamped c = new Vector3Stamped();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += vector.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    vector.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    vector.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Vector3Stamped))
      return false;
    Vector3Stamped other = (Vector3Stamped) o;
    return
      header.equals(other.header) &&
      vector.equals(other.vector) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.vector == null ? 0 : this.vector.hashCode());
    return result;
  }
} // class Vector3Stamped
