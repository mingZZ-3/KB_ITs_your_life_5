package D_0722.dept;

public class DeptVO {
    private int dNo;
    private String dName;
    private String loc;

    public DeptVO() { super(); }

    public DeptVO(int dNo, String dName, String loc) {
        this.dNo = dNo;
        this.dName = dName;
        this.loc = loc;
    }

    public int getdNo() {
        return dNo;
    }

    public void setdNo(int dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeptVO{");
        sb.append("dNo=").append(dNo);
        sb.append(", dName='").append(dName).append('\'');
        sb.append(", loc='").append(loc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
