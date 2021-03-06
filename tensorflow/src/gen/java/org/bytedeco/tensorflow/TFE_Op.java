// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_Op extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_Op(Pointer p) { super(p); }

  public TFE_Op(TFE_Context ctx, @Cast("const char*") BytePointer op, @Cast("bool") boolean is_function,
           @Cast("const tensorflow::AttrTypeMap*") VarToShapeMap t) { super((Pointer)null); allocate(ctx, op, is_function, t); }
  private native void allocate(TFE_Context ctx, @Cast("const char*") BytePointer op, @Cast("bool") boolean is_function,
           @Cast("const tensorflow::AttrTypeMap*") VarToShapeMap t);
  public TFE_Op(TFE_Context ctx, String op, @Cast("bool") boolean is_function,
           @Cast("const tensorflow::AttrTypeMap*") VarToShapeMap t) { super((Pointer)null); allocate(ctx, op, is_function, t); }
  private native void allocate(TFE_Context ctx, String op, @Cast("bool") boolean is_function,
           @Cast("const tensorflow::AttrTypeMap*") VarToShapeMap t);

  @MemberGetter public native @ByRef EagerOperation operation();
}
