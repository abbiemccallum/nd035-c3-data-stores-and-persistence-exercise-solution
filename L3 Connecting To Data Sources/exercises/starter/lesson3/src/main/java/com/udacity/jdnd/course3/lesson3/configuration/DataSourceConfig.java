@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix="com.udacity.datasource")
    public DataSource getDataSource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return dsb.build();
    }
}