package com.example.chapter3;

public class SortSample {
    private final int[] _data;

    public SortSample(int[] data) {
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < _data.length; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }

            assert isMin(m, x, _data.length - 1): this + ", x = " + x;

            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            
            assert isSorted(0, x + 1): this + ", x = " + x;
        }
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[ ");
        for (int i = 0; i < _data.length; i++) {
            buffer.append(_data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }

    /**
     * targetが_data[start] ~ _data[end]の間の全ての値以下であるかを判定するメソッド
     * @param target: 最小であるかを検証したい位置
     * @param start: 検証範囲の開始位置, >= 0
     * @param end: 検証範囲の終了位置, < _data.length
     * @return boolean
     */
    private boolean isMin(int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (_data[i] < _data[target]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 配列_dataがstart~endの間でソート済みであるかを判定するメソッド
     * @param start: 検証範囲の開始位置, >= 0
     * @param end: 検証範囲の終了位置, < _data.length
     * @return boolean
     */
    private boolean isSorted(int start, int end) {
        for (int i = start; i < end; i++) {
            if (_data[i] > _data[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
