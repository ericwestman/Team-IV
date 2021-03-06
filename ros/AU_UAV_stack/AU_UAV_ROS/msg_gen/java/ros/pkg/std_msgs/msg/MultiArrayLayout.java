/* Auto-generated by genmsg_java.py for file /opt/ros/electric/stacks/ros_comm/messages/std_msgs/msg/MultiArrayLayout.msg */

package ros.pkg.std_msgs.msg;

import java.nio.ByteBuffer;

public class MultiArrayLayout extends ros.communication.Message {

  public java.util.ArrayList<ros.pkg.std_msgs.msg.MultiArrayDimension> dim = new java.util.ArrayList<ros.pkg.std_msgs.msg.MultiArrayDimension>();
  public long data_offset;

  public MultiArrayLayout() {
  }

  public static java.lang.String __s_getDataType() { return "std_msgs/MultiArrayLayout"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "0fed2a11c13e11c5571b4e2a995a91a3"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# The multiarray declares a generic multi-dimensional array of a\n" +
"# particular data type.  Dimensions are ordered from outer most\n" +
"# to inner most.\n" +
"\n" +
"MultiArrayDimension[] dim # Array of dimension properties\n" +
"uint32 data_offset        # padding bytes at front of data\n" +
"\n" +
"# Accessors should ALWAYS be written in terms of dimension stride\n" +
"# and specified outer-most dimension first.\n" +
"# \n" +
"# multiarray(i,j,k) = data[data_offset + dim_stride[1]*i + dim_stride[2]*j + k]\n" +
"#\n" +
"# A standard, 3-channel 640x480 image with interleaved color channels\n" +
"# would be specified as:\n" +
"#\n" +
"# dim[0].label  = \"height\"\n" +
"# dim[0].size   = 480\n" +
"# dim[0].stride = 3*640*480 = 921600  (note dim[0] stride is just size of image)\n" +
"# dim[1].label  = \"width\"\n" +
"# dim[1].size   = 640\n" +
"# dim[1].stride = 3*640 = 1920\n" +
"# dim[2].label  = \"channel\"\n" +
"# dim[2].size   = 3\n" +
"# dim[2].stride = 3\n" +
"#\n" +
"# multiarray(i,j,k) refers to the ith row, jth column, and kth channel.\n" +
"================================================================================\n" +
"MSG: std_msgs/MultiArrayDimension\n" +
"string label   # label of given dimension\n" +
"uint32 size    # size of given dimension (in type units)\n" +
"uint32 stride  # stride of given dimension\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public MultiArrayLayout clone() {
    MultiArrayLayout c = new MultiArrayLayout();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4;
    for(ros.pkg.std_msgs.msg.MultiArrayDimension val : dim) {
      __l += val.serializationLength();
    }
    __l += 4; // data_offset
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putInt(dim.size());
    for(ros.pkg.std_msgs.msg.MultiArrayDimension val : dim) {
      val.serialize(bb, seq);
    }
    bb.putInt((int)data_offset);
  }

  public void deserialize(ByteBuffer bb) {

    int __dim_len = bb.getInt();
    dim = new java.util.ArrayList<ros.pkg.std_msgs.msg.MultiArrayDimension>(__dim_len);
    for(int __i=0; __i<__dim_len; __i++) {
      ros.pkg.std_msgs.msg.MultiArrayDimension __tmp = new ros.pkg.std_msgs.msg.MultiArrayDimension();
      __tmp.deserialize(bb);
      dim.add(__tmp);;
    }
    data_offset = (long)(bb.getInt() & 0xffffffff);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof MultiArrayLayout))
      return false;
    MultiArrayLayout other = (MultiArrayLayout) o;
    return
      dim.equals(other.dim) &&
      data_offset == other.data_offset &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.dim == null ? 0 : this.dim.hashCode());
    result = prime * result + (int)(this.data_offset ^ (this.data_offset >>> 32));
    return result;
  }
} // class MultiArrayLayout

