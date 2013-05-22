using System.ComponentModel;

namespace MVVMPattern.ViewModel
{
  public class ViewModelBase : INotifyPropertyChanged
  {
    public event PropertyChangedEventHandler PropertyChanged;

    protected void OnChanged(string propertyName)
    {
      var handler = PropertyChanged;
      if (handler != null)
        handler(this, new PropertyChangedEventArgs(propertyName));
    }
  }
}