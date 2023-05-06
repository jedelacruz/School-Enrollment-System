public class Student {
    private String name;
    private int id;
    private String strand;
    private String address;
    private String email;
    
    public Student(String name, int id, String strand, String address, String email) {
        this.name = name;
        this.id = id;
        this.strand = strand;
        this.address = address;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getStrand() {
        return strand;
    }
    
    public void setStrand(String strand) {
        this.strand = strand;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
