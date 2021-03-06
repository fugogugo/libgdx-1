/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;

public class btPolyhedralContactClipping {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btPolyhedralContactClipping (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btPolyhedralContactClipping obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btPolyhedralContactClipping(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public static void clipHullAgainstHull (Vector3 separatingNormal, btConvexPolyhedron hullA, btConvexPolyhedron hullB,
		btTransform transA, btTransform transB, float minDist, float maxDist,
		SWIGTYPE_p_btDiscreteCollisionDetectorInterface__Result resultOut) {
		gdxBulletJNI.btPolyhedralContactClipping_clipHullAgainstHull(separatingNormal, btConvexPolyhedron.getCPtr(hullA), hullA,
			btConvexPolyhedron.getCPtr(hullB), hullB, btTransform.getCPtr(transA), transA, btTransform.getCPtr(transB), transB,
			minDist, maxDist, SWIGTYPE_p_btDiscreteCollisionDetectorInterface__Result.getCPtr(resultOut));
	}

	public static void clipFaceAgainstHull (Vector3 separatingNormal, btConvexPolyhedron hullA, btTransform transA,
		SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t worldVertsB1, float minDist, float maxDist,
		SWIGTYPE_p_btDiscreteCollisionDetectorInterface__Result resultOut) {
		gdxBulletJNI.btPolyhedralContactClipping_clipFaceAgainstHull(separatingNormal, btConvexPolyhedron.getCPtr(hullA), hullA,
			btTransform.getCPtr(transA), transA, SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t.getCPtr(worldVertsB1), minDist,
			maxDist, SWIGTYPE_p_btDiscreteCollisionDetectorInterface__Result.getCPtr(resultOut));
	}

	public static boolean findSeparatingAxis (btConvexPolyhedron hullA, btConvexPolyhedron hullB, btTransform transA,
		btTransform transB, Vector3 sep) {
		return gdxBulletJNI.btPolyhedralContactClipping_findSeparatingAxis(btConvexPolyhedron.getCPtr(hullA), hullA,
			btConvexPolyhedron.getCPtr(hullB), hullB, btTransform.getCPtr(transA), transA, btTransform.getCPtr(transB), transB, sep);
	}

	public static void clipFace (SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t pVtxIn,
		SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t ppVtxOut, Vector3 planeNormalWS, float planeEqWS) {
		gdxBulletJNI.btPolyhedralContactClipping_clipFace(SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t.getCPtr(pVtxIn),
			SWIGTYPE_p_btAlignedObjectArrayT_btVector3_t.getCPtr(ppVtxOut), planeNormalWS, planeEqWS);
	}

	public btPolyhedralContactClipping () {
		this(gdxBulletJNI.new_btPolyhedralContactClipping(), true);
	}

}
