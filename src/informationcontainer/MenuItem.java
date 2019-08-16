package informationcontainer;

/**
 * メニュー画面の項目について扱うクラス．
 */
public class MenuItem {

	/**
	 * メニュー項目の文字．
	 */
	private String string;

	/**
	 * メニュー項目のx座標．
	 */
	private int coordinateX;

	/**
	 * メニュー項目のy座標．
	 */
	private int coordinateY;

	/**
	 * カーソル位置の番号．
	 */
	private int cursorPosition;

	/**
	 * MenuItemクラスのインスタンスを生成するためのクラスコンストラクタ．
	 * メニュー項目として表示させる文字，メニュー項目を表示させる場所のX座標とY座標，
	 * 選択カーソルを表示させる場所を指定するためのカーソル位置番号を用いてインスタンスの初期化を行う．
	 *
	 * @param string
	 *            メニュー項目の文字
	 * @param coordinateX
	 *            メニュー項目のx座標
	 * @param coordinateY
	 *            メニュー項目のy座標
	 * @param cursorPosition
	 *            カーソル位置番号
	 */
	public MenuItem(String string, int coordinateX, int coordinateY, int cursorPosition) {
		this.string = string;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.cursorPosition = cursorPosition;
	}

	/**
	 * メニュー項目の文字を返す．
	 *
	 * @return メニュー項目の文字
	 */
	public String getString() {
		return this.string;
	}

	/**
	 * メニュー項目のx座標を返す．
	 *
	 * @return メニュー項目のx座標
	 */
	public int getCoordinateX() {
		return this.coordinateX;
	}

	/**
	 * メニュー項目のy座標を返す．
	 *
	 * @return メニュー項目のy座標
	 */
	public int getCoordinateY() {
		return this.coordinateY;
	}

	/**
	 * メニュー項目のカーソル位置番号を返す．
	 *
	 * @return メニュー項目のカーソル位置番号
	 */
	public int getCursorPosition() {
		return this.cursorPosition;
	}
}
