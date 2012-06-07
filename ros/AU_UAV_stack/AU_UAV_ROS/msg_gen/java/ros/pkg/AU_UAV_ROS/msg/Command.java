/* Auto-generated by genmsg_java.py for file /home/uav-team3/AU-UAV-ROS/AU_UAV_stack/AU_UAV_ROS/msg/Command.msg */

package ros.pkg.AU_UAV_ROS.msg;

import java.nio.ByteBuffer;

public class Command extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header commandHeader = new ros.pkg.std_msgs.msg.Header();
  public short planeID;
  public double latitude;
  public double longitude;
  public double altitude;

  public Command() {
  }

  public static java.lang.String __s_getDataType() { return "AU_UAV_ROS/Command"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "c53c94d81a0a5526e6ff4317b73721aa"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "Header commandHeader\n" +
"int16 planeID\n" +
"float64 latitude\n" +
"float64 longitude\n" +
"float64 altitude\n" +
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
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Command clone() {
    Command c = new Command();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += commandHeader.serializationLength();
    __l += 2; // planeID
    __l += 8; // latitude
    __l += 8; // longitude
    __l += 8; // altitude
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    commandHeader.serialize(bb, seq);
    bb.putShort(planeID);
    bb.putDouble(latitude);
    bb.putDouble(longitude);
    bb.putDouble(altitude);
  }

  public void deserialize(ByteBuffer bb) {
    commandHeader.deserialize(bb);
    planeID = bb.getShort();
    latitude = bb.getDouble();
    longitude = bb.getDouble();
    altitude = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Command))
      return false;
    Command other = (Command) o;
    return
      commandHeader.equals(other.commandHeader) &&
      planeID == other.planeID &&
      latitude == other.latitude &&
      longitude == other.longitude &&
      altitude == other.altitude &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.commandHeader == null ? 0 : this.commandHeader.hashCode());
    result = prime * result + this.planeID;
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.latitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.longitude)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.altitude)) ^ (tmp >>> 32));
    return result;
  }
} // class Command
