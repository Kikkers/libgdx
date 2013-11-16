/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDispatcherInfo extends BulletBase {
	private long swigCPtr;
	
	protected btDispatcherInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDispatcherInfo, normally you should not need this constructor it's intended for low-level usage. */ 
	public btDispatcherInfo(long cPtr, boolean cMemoryOwn) {
		this("btDispatcherInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDispatcherInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btDispatcherInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btDispatcherInfo() {
    this(CollisionJNI.new_btDispatcherInfo(), true);
  }

  public void setTimeStep(float value) {
    CollisionJNI.btDispatcherInfo_timeStep_set(swigCPtr, this, value);
  }

  public float getTimeStep() {
    return CollisionJNI.btDispatcherInfo_timeStep_get(swigCPtr, this);
  }

  public void setStepCount(int value) {
    CollisionJNI.btDispatcherInfo_stepCount_set(swigCPtr, this, value);
  }

  public int getStepCount() {
    return CollisionJNI.btDispatcherInfo_stepCount_get(swigCPtr, this);
  }

  public void setDispatchFunc(int value) {
    CollisionJNI.btDispatcherInfo_dispatchFunc_set(swigCPtr, this, value);
  }

  public int getDispatchFunc() {
    return CollisionJNI.btDispatcherInfo_dispatchFunc_get(swigCPtr, this);
  }

  public void setTimeOfImpact(float value) {
    CollisionJNI.btDispatcherInfo_timeOfImpact_set(swigCPtr, this, value);
  }

  public float getTimeOfImpact() {
    return CollisionJNI.btDispatcherInfo_timeOfImpact_get(swigCPtr, this);
  }

  public void setUseContinuous(boolean value) {
    CollisionJNI.btDispatcherInfo_useContinuous_set(swigCPtr, this, value);
  }

  public boolean getUseContinuous() {
    return CollisionJNI.btDispatcherInfo_useContinuous_get(swigCPtr, this);
  }

  public void setDebugDraw(btIDebugDraw value) {
    CollisionJNI.btDispatcherInfo_debugDraw_set(swigCPtr, this, btIDebugDraw.getCPtr(value), value);
  }

  public btIDebugDraw getDebugDraw() {
    long cPtr = CollisionJNI.btDispatcherInfo_debugDraw_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btIDebugDraw(cPtr, false);
  }

  public void setEnableSatConvex(boolean value) {
    CollisionJNI.btDispatcherInfo_enableSatConvex_set(swigCPtr, this, value);
  }

  public boolean getEnableSatConvex() {
    return CollisionJNI.btDispatcherInfo_enableSatConvex_get(swigCPtr, this);
  }

  public void setEnableSPU(boolean value) {
    CollisionJNI.btDispatcherInfo_enableSPU_set(swigCPtr, this, value);
  }

  public boolean getEnableSPU() {
    return CollisionJNI.btDispatcherInfo_enableSPU_get(swigCPtr, this);
  }

  public void setUseEpa(boolean value) {
    CollisionJNI.btDispatcherInfo_useEpa_set(swigCPtr, this, value);
  }

  public boolean getUseEpa() {
    return CollisionJNI.btDispatcherInfo_useEpa_get(swigCPtr, this);
  }

  public void setAllowedCcdPenetration(float value) {
    CollisionJNI.btDispatcherInfo_allowedCcdPenetration_set(swigCPtr, this, value);
  }

  public float getAllowedCcdPenetration() {
    return CollisionJNI.btDispatcherInfo_allowedCcdPenetration_get(swigCPtr, this);
  }

  public void setUseConvexConservativeDistanceUtil(boolean value) {
    CollisionJNI.btDispatcherInfo_useConvexConservativeDistanceUtil_set(swigCPtr, this, value);
  }

  public boolean getUseConvexConservativeDistanceUtil() {
    return CollisionJNI.btDispatcherInfo_useConvexConservativeDistanceUtil_get(swigCPtr, this);
  }

  public void setConvexConservativeDistanceThreshold(float value) {
    CollisionJNI.btDispatcherInfo_convexConservativeDistanceThreshold_set(swigCPtr, this, value);
  }

  public float getConvexConservativeDistanceThreshold() {
    return CollisionJNI.btDispatcherInfo_convexConservativeDistanceThreshold_get(swigCPtr, this);
  }

  public final static class DispatchFunc {
    public final static int DISPATCH_DISCRETE = 1;
    public final static int DISPATCH_CONTINUOUS = DISPATCH_DISCRETE + 1;
  }

}