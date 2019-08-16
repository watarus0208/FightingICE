package struct;

import enumerate.State;
import fighting.Motion;

/**
 * The class dealing with invariable information in the game concerning motions,
 * such as the motion name and energy amount.
 */
public class MotionData {

	/**
	 * This motion's name.
	 */
	public String actionName;

	/**
	 * The number of frames in this motion.
	 */
	public int frameNumber;

	/**
	 * The speed value in the horizontal direction that will be applied to the
	 * character when it does this motion.
	 */
	public int speedX;

	/**
	 * The speed value in the vertical direction that will be applied to the
	 * character when it does this motion.
	 */
	public int speedY;

	/**
	 * The information on the hit box (boundary box in other games).
	 */
	public HitArea characterHitArea;

	/**
	 * The resulting state after running this motion.
	 */
	public State state;

	/**
	 * The information on the attack hit box.
	 */
	public HitArea attackHitArea;

	/**
	 * The horizontal speed of the attack hit box.
	 */
	public int attackSpeedX;

	/**
	 * The vertical speed of the attack hit box.
	 */
	public int attackSpeedY;

	/**
	 * The number of startup frames.
	 */
	public int attackStartUp;

	/**
	 * The number of active frames.
	 */
	public int attackActive;

	/**
	 * The value of the damage to the unguarding opponent when it is hit by this
	 * skill.
	 */
	public int attackHitDamage;

	/**
	 * The value of the damage to the guarding opponent when it is hit by this
	 * skill.
	 */
	public int attackGuardDamage;

	/**
	 * The value of the energy added to the character when it uses this skill.
	 */
	public int attackStartAddEnergy;

	/**
	 * The value of the energy added to the character when this skill hits the
	 * opponent.
	 */
	public int attackHitAddEnergy;

	/**
	 * The value of the energy added to the character when this skill is guarded
	 * by the guarding opponent.
	 */
	public int attackGuardAddEnergy;

	/**
	 * The value of the energy given to the opponent when it is hit by this
	 * skill.
	 */
	public int attackGiveEnergy;

	/**
	 * The change in the horizontal speed of the opponent when it is hit by this
	 * skill.
	 */
	public int attackImpactX;
	/**
	 * The change in the vertical speed of the opponent when it is hit by this
	 * skill.
	 */
	public int attackImpactY;

	/**
	 * The number of frames that the guarding opponent needs to resume to its
	 * normal status when it is hit by this skill.
	 */
	public int attackGiveGuardRecov;

	/**
	 * The value of attack type: 1 = high, 2 = middle, 3 = low, 4 = throw.
	 */
	public int attackType;

	/**
	 * The flag whether this skill can push down the opponent when it is hit by
	 * this skill.
	 */
	public boolean attackDownProp;

	/**
	 * The frame number of the first frame that the character can cancel this
	 * motion.<br>
	 * If this motion has reached this timing, it can be canceled with a motion
	 * having a {@link #motionLevel} less than or equal to the
	 * {@link #cancelAbleMotionLevel} of this motion. If this motion has no
	 * cancelable period, the returned value will be -1.
	 */
	public int cancelAbleFrame;

	/**
	 * The value of the level that can cancel this motion.<br>
	 * During cancelable frames, any motion whose level is less than or equal to
	 * this value can cancel this motion.
	 */
	public int cancelAbleMotionLevel;

	/**
	 * The value of this motion's level.
	 *
	 * @see #cancelAbleMotionLevel
	 * @see #cancelAbleFrame
	 */
	public int motionLevel;

	/**
	 * The flag whether this character can run a motion with the motion's
	 * command.
	 */
	public boolean control;

	/**
	 * The flag whether a landing motion can cancel this motion.
	 */
	public boolean landingFlag;

	/**
	 * The class constructor.
	 */
	public MotionData() {
	}

	/**
	 * The class constructor that generates an instance of the MotionData class
	 * by using an instance of the class passed as the argument.
	 *
	 * @param motion
	 *            an instance of the Motion class
	 *
	 * @see Motion
	 */
	public MotionData(Motion motion) {
		this.actionName = motion.getActionName();
		this.frameNumber = motion.getFrameNumber();
		this.speedX = motion.getSpeedX();
		this.speedY = motion.getSpeedY();
		this.characterHitArea = motion.getCharacterHitArea();
		this.state = motion.getState();
		this.attackHitArea = motion.getAttackHitArea();
		this.attackSpeedX = motion.getAttackSpeedX();
		this.attackSpeedY = motion.getAttackSpeedY();
		this.attackStartUp = motion.getAttackStartUp();
		this.attackActive = motion.getAttackActive();
		this.attackHitDamage = motion.getAttackHitDamage();
		this.attackGuardDamage = motion.getAttackGuardDamage();
		this.attackStartAddEnergy = motion.getAttackStartAddEnergy();
		this.attackHitAddEnergy = motion.getAttackHitAddEnergy();
		this.attackGuardAddEnergy = motion.getAttackGuardAddEnergy();
		this.attackGiveEnergy = motion.getAttackGiveEnergy();
		this.attackImpactX = motion.getAttackImpactX();
		this.attackImpactY = motion.getAttackImpactY();
		this.attackGiveGuardRecov = motion.getAttackGiveGuardRecov();
		this.attackType = motion.getAttackType();
		this.attackDownProp = motion.isAttackDownProp();
		this.cancelAbleFrame = motion.getCancelAbleFrame();
		this.cancelAbleMotionLevel = motion.getCancelAbleMotionLevel();
		this.motionLevel = motion.getMotionLevel();
		this.control = motion.isControl();
		this.landingFlag = motion.isLandingFlag();
	}

	/**
	 * Returns the name of this motion.
	 *
	 * @return the name of this motion
	 */
	public String getActionName() {
		return this.actionName;
	}

	/**
	 * Returns the number of frames in this motion.
	 *
	 * @return the number of frames in this motion
	 */
	public int getFrameNumber() {
		return this.frameNumber;
	}

	/**
	 * Returns the horizontal speed applied to a character using this motion.
	 *
	 * @return the horizontal speed applied to a character using this motion
	 */
	public int getSpeedX() {
		return this.speedX;
	}

	/**
	 * Returns the vertical speed applied to a character using this motion.
	 *
	 * @return the vertical speed applied to a character using this motion
	 */
	public int getSpeedY() {
		return this.speedY;
	}

	/**
	 * Returns the attack's hit area associated to this motion.
	 *
	 * @return the attack's hit area associated to this motion
	 */
	public HitArea getAttackHitArea() {
		return this.attackHitArea;
	}

	/**
	 * Returns the character's hit area associated to this motion.
	 *
	 * @return the character's hit area associated to this motion
	 */
	public HitArea getCharacterHitArea() {
		return this.characterHitArea;
	}

	/**
	 * Returns the state that is assigned to a character after this motion is
	 * completed.
	 *
	 * @return the state that is assigned to a character after this motion is
	 *         completed
	 */
	public State getState() {
		return this.state;
	}

	/**
	 * Returns the horizontal speed of the attack hit box.
	 *
	 * @return the horizontal speed of the attack hit box
	 */
	public int getAttackSpeedX() {
		return attackSpeedX;
	}

	/**
	 * Returns the vertical speed of the attack hit box.
	 *
	 * @return the vertical speed of the attack hit box
	 */
	public int getAttackSpeedY() {
		return attackSpeedY;
	}

	/**
	 * Returns the number of startup frames.
	 *
	 * @return the number of startup frames
	 */
	public int getAttackStartUp() {
		return attackStartUp;
	}

	/**
	 * Returns the number of active frames.
	 *
	 * @return the number of active frames
	 */
	public int getAttackActive() {
		return attackActive;
	}

	/**
	 * Returns the value of the damage to the unguarding opponent when it is hit
	 * by this skill.
	 *
	 * @return the value of the damage to the unguarding opponent when it is hit
	 *         by this skill
	 */
	public int getAttackHitDamage() {
		return attackHitDamage;
	}

	/**
	 * Returns the value of the damage to the guarding opponent when it is hit
	 * by this skill.
	 *
	 * @return the value of the damage to the guarding opponent when it is hit
	 *         by this skill
	 */
	public int getAttackGuardDamage() {
		return attackGuardDamage;
	}

	/**
	 * Returns the controllable state associated to this motion.<br>
	 * If the flag is false, a character using this motion cannot be controlled
	 * until this motion finishes.
	 *
	 * @return {@code true} if a character using this motion is controllable,
	 *         {@code false} otherwise
	 */
	public boolean isControl() {
		return this.control;
	}

	/**
	 * Returns the value of the energy added to the character when it uses this
	 * skill.
	 *
	 * @return the value of the energy added to the character when it uses this
	 *         skill
	 */
	public int getAttackStartAddEnergy() {
		return attackStartAddEnergy;
	}

	/**
	 * Returns the frame number of the first frame that this motion can be
	 * canceled.<br>
	 * Notice that only a motion whose {@link #motionLevel} is less than or
	 * equal to the {@link #cancelAbleMotionLevel} of this one can cancel this
	 * motion.
	 *
	 * @return the frame number of the first frame that this motion can be
	 *         canceled
	 */
	public int getCancelAbleFrame() {
		return this.cancelAbleFrame;
	}

	/**
	 * Returns the value of the energy added to the character when this skill
	 * hits the opponent.
	 *
	 * @return the value of the energy added to the character when this skill
	 *         hits the opponent
	 */
	public int getAttackHitAddEnergy() {
		return attackHitAddEnergy;
	}

	/**
	 * Returns the value of the energy added to the character when this skill is
	 * guarded by the guarding opponent.
	 *
	 * @return the value of the energy added to the character when this skill is
	 *         guarded by the guarding opponent
	 */
	public int getAttackGuardAddEnergy() {
		return attackGuardAddEnergy;
	}

	/**
	 * Returns the value of the energy given to the opponent when it is hit by
	 * this skill.
	 *
	 * @return the value of the energy given to the opponent when it is hit by
	 *         this skill
	 */
	public int getAttackGiveEnergy() {
		return attackGiveEnergy;
	}

	/**
	 * Returns the change in the horizontal speed of the opponent when it is hit
	 * by this skill.
	 *
	 * @return the change in the horizontal speed of the opponent when it is hit
	 *         by this skill
	 */
	public int getAttackImpactX() {
		return attackImpactX;
	}

	/**
	 * Returns the change in the vertical speed of the opponent when it is hit
	 * by this skill.
	 *
	 * @return the change in the vertical speed of the opponent when it is hit
	 *         by this skill
	 */
	public int getAttackImpactY() {
		return attackImpactY;
	}

	/**
	 * Returns the number of frames that the guarding opponent needs to resume
	 * to its normal status when it is hit by this skill.
	 *
	 * @return the number of frames that the guarding opponent needs to resume
	 *         to its normal status when it is hit by this skill
	 */
	public int getAttackGiveGuardRecov() {
		return attackGiveGuardRecov;
	}

	/**
	 * Returns the value of the attack type:<br>
	 * 1 = high<br>
	 * 2 = middle<br>
	 * 3 = low<br>
	 * 4 = throw<br>
	 *
	 * @return the value of the attack type
	 */
	public int getAttackType() {
		return attackType;
	}

	/**
	 * Returns the flag whether this skill can push down the opponent when hit.
	 *
	 * @return the flag whether this skill can push down the opponent when hit
	 */
	public boolean isAttackDownProp() {
		return attackDownProp;
	}

	/**
	 * Returns the maximum {@link #motionLevel} a motion can have in order to be
	 * able to cancel this motion.
	 *
	 * @return the maximum {@link #motionLevel} a motion can have in order to be
	 *         able to cancel this motion
	 */
	public int getCancelAbleMotionLevel() {
		return this.cancelAbleMotionLevel;
	}

	/**
	 * Returns the level of this motion. Notice that this motion can cancel
	 * other motions (after their {@link #cancelAbleFrame}) if such motions have
	 * a {@link #cancelAbleMotionLevel} higher than or equal to the level of
	 * this motion.
	 *
	 * @return the level of this motion
	 */
	public int getMotionLevel() {
		return this.motionLevel;
	}

	/**
	 * Returns {@code true} if the landing motion can cancel this motion,
	 * {@code false} otherwise.
	 *
	 * @return the boolean value that expresses whether or not character lands
	 *         in this motion
	 */
	public boolean isLandingFlag() {
		return this.landingFlag;
	}

	////// Setter//////
	/**
	 * Sets the name of this motion.
	 *
	 * @param motionName
	 *            the motion name to be set.
	 */
	public void setMotionName(String motionName) {
		this.actionName = motionName;
	}

	/**
	 * Set the number of frames in this motion.
	 *
	 * @param frameNumber
	 *            the number of frames to be set
	 */
	public void setFrameNumber(int frameNumber) {
		this.frameNumber = frameNumber;
	}

	/**
	 * Sets the {@link #speedX} setting, which stores the horizontal speed
	 * applied to a character using this motion.
	 *
	 * @param speedX
	 *            the value to assign to the {@link #speedX} setting
	 */
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	/**
	 * Sets the {@link #speedY} setting, which stores the vertical speed applied
	 * to a character using this motion.
	 *
	 * @param speedY
	 *            the value to assign to the {@link #speedY} setting
	 */
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	/**
	 * Sets the attack's hit area of this action.
	 *
	 * @param attackHitArea
	 *            the attack's hit area
	 *
	 * @see HitArea
	 */
	public void setAttackHitArea(HitArea attackHitArea) {
		this.attackHitArea = attackHitArea;
	}

	/**
	 * Sets the character's hit area of this motion.
	 *
	 * @param characterHitArea
	 *            the character's hit area
	 *
	 * @see HitArea
	 */
	public void setCharacterHitArea(HitArea characterHitArea) {
		this.characterHitArea = characterHitArea;
	}

	/**
	 * Sets the horizontal speed of the attack hit box.
	 *
	 * @param attackSpeedX
	 *            the horizontal speed of the attack hit box
	 */
	public void setAttackSpeedX(int attackSpeedX) {
		this.attackSpeedX = attackSpeedX;
	}

	/**
	 * Sets the vertical speed of the attack hit box.
	 *
	 * @param attackSpeedY
	 *            the vertical speed of the attack hit box
	 */
	public void setAttackSpeedY(int attackSpeedY) {
		this.attackSpeedY = attackSpeedY;
	}

	/**
	 * Sets the number of startup frames.
	 *
	 * @param attackStartUp
	 *            the number of startup frames
	 */
	public void setAttackStartUp(int attackStartUp) {
		this.attackStartUp = attackStartUp;
	}

	/**
	 * Sets the number of active frames.
	 *
	 * @param attackActive
	 *            the number of active frames
	 */
	public void setAttackActive(int attackActive) {
		this.attackActive = attackActive;
	}

	/**
	 * Sets the value of the damage to the unguarding opponent when it is hit by
	 * this skill.
	 *
	 * @param attackHitDamage
	 *            the value of the damage to the unguarding opponent when it is
	 *            hit by this skill
	 */
	public void setAttackHitDamage(int attackHitDamage) {
		this.attackHitDamage = attackHitDamage;
	}

	/**
	 * Sets the value of the damage to the guarding opponent when it is hit by
	 * this skill.
	 *
	 * @param attackGuardDamage
	 *            the value of the damage to the guarding opponent when it is
	 *            hit by this skill
	 */
	public void setAttackGuardDamage(int attackGuardDamage) {
		this.attackGuardDamage = attackGuardDamage;
	}

	/**
	 * Sets the value of the energy added to the character when it uses this
	 * skill.
	 *
	 * @param attackStartAddEnergy
	 *            the value of the energy added to the character when it uses
	 *            this skill
	 */
	public void setAttackStartAddEnergy(int attackStartAddEnergy) {
		this.attackStartAddEnergy = attackStartAddEnergy;
	}

	/**
	 * Sets the value of the energy added to the character when this skill hits
	 * the opponent.
	 *
	 * @param attackHitAddEnergy
	 *            the value of the energy added to the character when this skill
	 *            hits the opponent
	 */
	public void setAttackHitAddEnergy(int attackHitAddEnergy) {
		this.attackHitAddEnergy = attackHitAddEnergy;
	}

	/**
	 * Sets the value of the energy added to the character when this skill is
	 * guarded by the guarding opponent.
	 *
	 * @param attackGuardAddEnergy
	 *            the value of the energy added to the character when this skill
	 *            is guarded by the guarding opponent
	 */
	public void setAttackGuardAddEnergy(int attackGuardAddEnergy) {
		this.attackGuardAddEnergy = attackGuardAddEnergy;
	}

	/**
	 * Sets the value of the energy given to the opponent when it is hit by this
	 * skill.
	 *
	 * @param attackGiveEnergy
	 *            the value of the energy given to the opponent when it is hit
	 *            by this skill
	 */
	public void setAttackGiveEnergy(int attackGiveEnergy) {
		this.attackGiveEnergy = attackGiveEnergy;
	}

	/**
	 * Sets the change in the horizontal speed of the opponent when it is hit by
	 * this skill.
	 *
	 * @param attackImpactX
	 *            the change in the horizontal speed of the opponent when it is
	 *            hit by this skill
	 */
	public void setAttackImpactX(int attackImpactX) {
		this.attackImpactX = attackImpactX;
	}

	/**
	 * Sets the change in the vertical speed of the opponent when it is hit by
	 * this skill.
	 *
	 * @param attackImpactY
	 *            the change in the vertical speed of the opponent when it is
	 *            hit by this skill
	 */
	public void setAttackImpactY(int attackImpactY) {
		this.attackImpactY = attackImpactY;
	}

	/**
	 * Sets the number of frames that the guarding opponent needs to resume to
	 * its normal status after being hit by this skill.
	 *
	 * @param attackGiveGuardRecov
	 *            the number of frames that the guarding opponent needs to
	 *            resume to its normal status after being hit by this skill
	 */
	public void setAttackGiveGuardRecov(int attackGiveGuardRecov) {
		this.attackGiveGuardRecov = attackGiveGuardRecov;
	}

	/**
	 * Sets the value of the attack type:<br>
	 * 1 = high,<br>
	 * 2 = middle,<br>
	 * 3 = low,<br>
	 * 4 = throw,<br>
	 *
	 * @param attackType
	 *            the value of the attack type
	 */
	public void setAttackType(int attackType) {
		this.attackType = attackType;
	}

	/**
	 * Sets the {@link #control} flag.<br>
	 * If the flag is false, a character using this motion cannot be controlled
	 * until this motion finishes.
	 *
	 * @param control
	 *            the value to give to the flag
	 */
	public void setControl(boolean control) {
		this.control = control;
	}

	/**
	 * Sets the flag whether this skill can push down the opponent when it is
	 * hit by this skill.
	 *
	 * @param attackDownProp
	 *            the flag whether this skill can push down the opponent when it
	 *            is hit by this skill
	 */
	public void setAttackDownProp(boolean attackDownProp) {
		this.attackDownProp = attackDownProp;
	}

	/**
	 * Sets the {@link #cancelAbleFrame} setting.<br>
	 * This indicates the frame number of the first frame that this motion can
	 * be canceled.
	 *
	 * @param cancelAbleFrame
	 *            the value to assign to the {@link #cancelAbleFrame} setting
	 */
	public void setCancelAbleFrame(int cancelAbleFrame) {
		this.cancelAbleFrame = cancelAbleFrame;
	}

	/**
	 * Sets the {@link #cancelAbleMotionLevel} setting.<br>
	 * This indicates the maximum level that a motion can have to be able to
	 * cancel this motion. During cancelable frames, a motion whose level is
	 * less than or equal to this value can cancel the current motion.
	 *
	 * @param cancelAbleMotionLevel
	 *            the value to assign to the {@link #cancelAbleMotionLevel}
	 *            setting
	 */
	public void setCancelAbleMotionLevel(int cancelAbleMotionLevel) {
		this.cancelAbleMotionLevel = cancelAbleMotionLevel;
	}

	/**
	 * Sets the {@link #motionLevel} of this motion.
	 *
	 * @param motionLevel
	 *            the value to assign to the {@link #motionLevel} setting
	 */
	public void setMotionLevel(int motionLevel) {
		this.motionLevel = motionLevel;
	}

	/**
	 * Sets the {@link #state} setting, which represents the state assigned to
	 * the character at the end of this motion.
	 *
	 * @param state
	 *            the value to assign to the {@link #state} setting
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Sets the {@link #landingFlag} setting, a flag encoding whether the
	 * Landing motion can cancel this motion.
	 *
	 * @param landingFlag
	 *            the value to assign to the {@link #landingFlag} setting
	 */
	public void setLandingFlag(boolean landingFlag) {
		this.landingFlag = landingFlag;
	}

}
