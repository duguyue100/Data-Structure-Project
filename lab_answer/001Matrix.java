
public class Matrix {
	public int[][] matrix=new int[2][2];
	
	public Matrix()
	{
		
	}
	
	public Matrix(int a, int b, int c, int d)
	{
		matrix[0][0]=a;
		matrix[0][1]=b;
		matrix[1][0]=c;
		matrix[1][1]=d;
	}
	
	public Matrix(Matrix mat)
	{
		Matrix m=new Matrix(mat.matrix[0][0],mat.matrix[0][1],mat.matrix[1][0],mat.matrix[1][1]);
	}
	
	public Matrix add(Matrix mat)
	{
		Matrix result=new Matrix();
		
		result.matrix[0][0]=mat.matrix[0][0]+this.matrix[0][0];
		result.matrix[0][1]=mat.matrix[0][1]+this.matrix[0][1];
		result.matrix[1][0]=mat.matrix[1][0]+this.matrix[1][0];
		result.matrix[1][1]=mat.matrix[1][1]+this.matrix[1][1];
		
		return result;
	}
	
	public Matrix subtract(Matrix mat)
	{
		Matrix result=new Matrix();
		
		result.matrix[0][0]=this.matrix[0][0]-mat.matrix[0][0];
		result.matrix[0][1]=this.matrix[0][1]-mat.matrix[0][1];
		result.matrix[1][0]=this.matrix[1][0]-mat.matrix[1][0];
		result.matrix[1][1]=this.matrix[1][1]-mat.matrix[1][1];
		
		return result;
	}
	
	public Matrix multiply(Matrix mat)
	{
		Matrix result=new Matrix();
		
		result.matrix[0][0]=this.matrix[0][0]*mat.matrix[0][0]+this.matrix[0][1]*mat.matrix[1][0];
		result.matrix[0][1]=this.matrix[0][0]*mat.matrix[0][1]+this.matrix[0][1]*mat.matrix[1][1];
		result.matrix[1][0]=this.matrix[1][0]*mat.matrix[0][0]+this.matrix[1][0]*mat.matrix[1][0];
		result.matrix[1][1]=this.matrix[1][0]*mat.matrix[0][1]+this.matrix[1][0]*mat.matrix[1][1];
		
		return result;
	}
	
	public int compare(Matrix mat)
	{
		int check=0;
		
		if (this.matrix[0][0]==mat.matrix[0][0] &&
			this.matrix[0][1]==mat.matrix[0][1] &&
			this.matrix[1][0]==mat.matrix[1][0] &&
			this.matrix[1][1]==mat.matrix[1][1])
		{
			return 1;
		}
		
		return check;
	}
	
	public void print(Matrix mat)
	{
		System.out.println(mat.matrix[0][0]+" "+mat.matrix[0][1]+"\n"+
				mat.matrix[1][0]+" "+mat.matrix[1][1]);
	}

}
